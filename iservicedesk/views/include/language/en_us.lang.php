<?php
if(!defined('sugarEntry') || !sugarEntry) die('Not A Valid Entry Point');
/*********************************************************************************
 * The contents of this file are subject to the SugarCRM Public License Version
 * 1.1.3 ("License"); You may not use this file except in compliance with the
 * License. You may obtain a copy of the License at http://www.sugarcrm.com/SPL
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied.  See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * All copies of the Covered Code must include on each user interface screen:
 *    (i) the "Powered by SugarCRM" logo and
 *    (ii) the SugarCRM copyright notice
 * in the same form as they appear in the distribution.  See full license for
 * requirements.
 *
 * The Original Code is: SugarCRM Open Source
 * The Initial Developer of the Original Code is SugarCRM, Inc.
 * Portions created by SugarCRM are Copyright (C) 2004-2006 SugarCRM, Inc.;
 * All Rights Reserved.
 * Contributor(s): ______________________________________.
 ********************************************************************************/
/*********************************************************************************

 * Description:  Defines the English language pack for the base application.
 * Portions created by SugarCRM are Copyright (C) SugarCRM, Inc.
 * All Rights Reserved.
 * Contributor(s): ______________________________________..
 ********************************************************************************/

//the left value is the key stored in the db and the right value is the display value
//to translate, only modify the right value in each key/value pair
$app_list_strings = array (
//e.g. auf Deutsch 'Contacts'=>'Contakten',
  'language_pack_name' => 'US English',
  'moduleList' =>
  array (
    'Home' => 'Home',
    'Dashboard' => 'Dashboard',
    'Contacts' => 'Contacts',
    'Accounts' => 'Accounts',
    'Opportunities' => 'Opportunities',
    'Cases' => 'Cases',
    'Notes' => 'Notes',
    'Calls' => 'Calls',
    'Emails' => 'Emails',
    'Meetings' => 'Meetings',
    'Tasks' => 'Tasks',
    'Calendar' => 'Calendar',
    'Leads' => 'Leads',














    'Activities' => 'Activities',
    'Bugs' => 'Bug Tracker',
    'Feeds' => 'RSS',
    'iFrames'=>'My Portal',
    'TimePeriods'=>'Time Periods',
    'Project'=>'Projects',




    'ProjectTask'=>'Project Tasks',
    'Campaigns'=>'Campaigns',
    'Documents'=>'Documents',
    'Sync'=>'Sync',






    'Users' => 'Users',
    'Releases' => 'Releases',    
    'Prospects' => 'Targets',
    'Queues' => 'Queues',
    'EmailMarketing' => 'Email Marketing',
    'EmailTemplates' => 'Email Templates',
    'ProspectLists' => 'Target Lists',
    'SavedSearch' => 'Saved Searches',
        ),
  'moduleListSingular' =>
  array (
    'Home' => 'Home',
    'Dashboard' => 'Dashboard',
    'Contacts' => 'Contact',
    'Accounts' => 'Account',
    'Opportunities' => 'Opportunity',
    'Cases' => 'Case',
    'Notes' => 'Note',
    'Calls' => 'Call',
    'Emails' => 'Email',
    'Meetings' => 'Meeting',
    'Tasks' => 'Task',
    'Calendar' => 'Calendar',
    'Leads' => 'Lead',









    'Activities' => 'Activitie',
    'Bugs' => 'Bug Tracker',
    'Feeds' => 'RSS',
    'iFrames'=>'My Portal',
    'TimePeriods'=>'Time Period',
    'Project'=>'Projects',




    'ProjectTask'=>'Project Task',
    'Campaigns'=>'Campaigns',
    'Documents'=>'Documents',
    'Sync'=>'Sync',






    'Users' => 'User'
        ),        

  'checkbox_dom'=> array(
  	''=>'',
  	'1'=>'Yes',
  	'2'=>'No',
  ),
          
  //e.g. en fran�ais 'Analyst'=>'Analyste',
  'account_type_dom' =>
  array (
    '' => '',
    'Analyst' => 'Analyst',
    'Competitor' => 'Competitor',
    'Customer' => 'Customer',
    'Integrator' => 'Integrator',
    'Investor' => 'Investor',
    'Partner' => 'Partner',
    'Press' => 'Press',
    'Prospect' => 'Prospect',
    'Reseller' => 'Reseller',
    'Other' => 'Other',
  ),
  //e.g. en espa�ol 'Apparel'=>'Ropa',
  'industry_dom' =>
  array (
    '' => '',
    'Apparel' => 'Apparel',
    'Banking' => 'Banking',
    'Biotechnology' => 'Biotechnology',
    'Chemicals' => 'Chemicals',
    'Communications' => 'Communications',
    'Construction' => 'Construction',
    'Consulting' => 'Consulting',
    'Education' => 'Education',
    'Electronics' => 'Electronics',
    'Energy' => 'Energy',
    'Engineering' => 'Engineering',
    'Entertainment' => 'Entertainment',
    'Environmental' => 'Environmental',
    'Finance' => 'Finance',
    'Government' => 'Government',
    'Healthcare' => 'Healthcare',
    'Hospitality' => 'Hospitality',
    'Insurance' => 'Insurance',
    'Machinery' => 'Machinery',
    'Manufacturing' => 'Manufacturing',
    'Media' => 'Media',
    'Not For Profit' => 'Not For Profit',
    'Recreation' => 'Recreation',
    'Retail' => 'Retail',
    'Shipping' => 'Shipping',
    'Technology' => 'Technology',
    'Telecommunications' => 'Telecommunications',
    'Transportation' => 'Transportation',
    'Utilities' => 'Utilities',
    'Other' => 'Other',
  ),
  'source_default_key' => 'Self Generated',
  'lead_source_dom' =>
  array (
    '' => '',
    'Cold Call' => 'Cold Call',
    'Existing Customer' => 'Existing Customer',
    'Self Generated' => 'Self Generated',
    'Employee' => 'Employee',
    'Partner' => 'Partner',
    'Public Relations' => 'Public Relations',
    'Direct Mail' => 'Direct Mail',
    'Conference' => 'Conference',
    'Trade Show' => 'Trade Show',
    'Web Site' => 'Web Site',
    'Word of mouth' => 'Word of mouth',
    'Email' => 'Email',
    'Campaign'=>'Campaign',
    'Other' => 'Other',
  ),
  'opportunity_type_dom' =>
  array (
    '' => '',
    'Existing Business' => 'Existing Business',
    'New Business' => 'New Business',
  ),
  'roi_type_dom' =>
    array (
    'Revenue' => 'Revenue',
    'Investment'=>'Investment',
    'Expected_Revenue'=>'Expected Revenue',
    'Budget'=>'Budget',
       
  ),
  //Note:  do not translate opportunity_relationship_type_default_key
//       it is the key for the default opportunity_relationship_type_dom value
  'opportunity_relationship_type_default_key' => 'Primary Decision Maker',
  'opportunity_relationship_type_dom' =>
  array (
    '' => '',
    'Primary Decision Maker' => 'Primary Decision Maker',
    'Business Decision Maker' => 'Business Decision Maker',
    'Business Evaluator' => 'Business Evaluator',
    'Technical Decision Maker' => 'Technical Decision Maker',
    'Technical Evaluator' => 'Technical Evaluator',
    'Executive Sponsor' => 'Executive Sponsor',
    'Influencer' => 'Influencer',
    'Other' => 'Other',
  ),
  //Note:  do not translate case_relationship_type_default_key
//       it is the key for the default case_relationship_type_dom value
  'case_relationship_type_default_key' => 'Primary Contact',
  'case_relationship_type_dom' =>
  array (
    '' => '',
    'Primary Contact' => 'Primary Contact',
    'Alternate Contact' => 'Alternate Contact',
  ),
  'payment_terms' =>
  array (
  	'' => '', 
	'Net 15' => 'Net 15',
	'Net 30' => 'Net 30',
  ),  
  'sales_stage_default_key' => 'Prospecting',
  'sales_stage_dom' =>
  array (
    'Prospecting' => 'Prospecting',
    'Qualification' => 'Qualification',
    'Needs Analysis' => 'Needs Analysis',
    'Value Proposition' => 'Value Proposition',
    'Id. Decision Makers' => 'Id. Decision Makers',
    'Perception Analysis' => 'Perception Analysis',
    'Proposal/Price Quote' => 'Proposal/Price Quote',
    'Negotiation/Review' => 'Negotiation/Review',
    'Closed Won' => 'Closed Won',
    'Closed Lost' => 'Closed Lost',
  ),
  'sales_probability_dom' => // keys must be the same as sales_stage_dom
  array (
    'Prospecting' => '10',
    'Qualification' => '20',
    'Needs Analysis' => '25',
    'Value Proposition' => '30',
    'Id. Decision Makers' => '40',
    'Perception Analysis' => '50',
    'Proposal/Price Quote' => '65',
    'Negotiation/Review' => '80',
    'Closed Won' => '100',
    'Closed Lost' => '0',
  ),
  'activity_dom' =>
  array (
    'Call' => 'Call',
    'Meeting' => 'Meeting',
    'Task' => 'Task',
    'Email' => 'Email',
    'Note' => 'Note',
  ),
  'salutation_dom' =>
	  array (
	    '' => '',
	    'Mr.' => 'Mr.',
	    'Ms.' => 'Ms.',
	    'Mrs.' => 'Mrs.',
	    'Dr.' => 'Dr.',
	    'Prof.' => 'Prof.',
	  ),
  //time is in seconds; the greater the time the longer it takes;
  'reminder_max_time'=>3600,
  'reminder_time_options' => array( 60=> '1 minute prior',
  								  300=> '5 minutes prior',
  								  600=> '10 minutes prior',
  								  900=> '15 minutes prior',
  								  1800=> '30 minutes prior',
  								  3600=> '1 hour prior',
								 ),

  'task_priority_default' => 'Medium',
  'task_priority_dom' =>
  array (
    'High' => 'High',
    'Medium' => 'Medium',
    'Low' => 'Low',
  ),
  'task_status_default' => 'Not Started',
  'task_status_dom' =>
  array (
    'Not Started' => 'Not Started',
    'In Progress' => 'In Progress',
    'Completed' => 'Completed',
    'Pending Input' => 'Pending Input',
    'Deferred' => 'Deferred',
  ),
  'meeting_status_default' => 'Planned',
  'meeting_status_dom' =>
  array (
    'Planned' => 'Planned',
    'Held' => 'Held',
    'Not Held' => 'Not Held',
  ),
  'call_status_default' => 'Planned',
  'call_status_dom' =>
  array (
    'Planned' => 'Planned',
    'Held' => 'Held',
    'Not Held' => 'Not Held',
  ),
  'call_direction_default' => 'Outbound',
  'call_direction_dom' =>
  array (
    'Inbound' => 'Inbound',
    'Outbound' => 'Outbound',
  ),
  'lead_status_dom' =>
  array (
    '' => '',
    'New' => 'New',
    'Assigned' => 'Assigned',
    'In Process' => 'In Process',
    'Converted' => 'Converted',
    'Recycled' => 'Recycled',
    'Dead' => 'Dead',
  ),
  'lead_status_noblank_dom' =>
  array (
    'New' => 'New',
    'Assigned' => 'Assigned',
    'In Process' => 'In Process',
    'Converted' => 'Converted',
    'Recycled' => 'Recycled',
    'Dead' => 'Dead',
  ),
  //Note:  do not translate case_status_default_key
//       it is the key for the default case_status_dom value
  'case_status_default_key' => 'New',
  'case_status_dom' =>
  array (
    'New' => 'New',
    'Assigned' => 'Assigned',
    'Closed' => 'Closed',
    'Pending Input' => 'Pending Input',
    'Rejected' => 'Rejected',
    'Duplicate' => 'Duplicate',
  ),
  'case_priority_default_key' => 'P2',
  'case_priority_dom' =>
  array (
    'P1' => 'High',
    'P2' => 'Medium',
    'P3' => 'Low',
  ),
  'user_status_dom' =>
  array (
    'Active' => 'Active',
    'Inactive' => 'Inactive',
  ),
  'employee_status_dom' =>
  array (
    'Active' => 'Active',
    'Terminated' => 'Terminated',
    'Leave of Absence' => 'Leave of Absence',
  ),
  'messenger_type_dom' =>
  array (
    '' => '',
    'MSN' => 'MSN',
    'Yahoo!' => 'Yahoo!',
    'AOL' => 'AOL',
  ),

	'project_task_priority_options' => array (
		'High' => 'High',
		'Medium' => 'Medium',
		'Low' => 'Low',
	),
	'project_task_status_options' => array (
		'Not Started' => 'Not Started',
		'In Progress' => 'In Progress',
		'Completed' => 'Completed',
		'Pending Input' => 'Pending Input',
		'Deferred' => 'Deferred',
	),
	'project_task_utilization_options' => array (
		'0' => 'none',
		'25' => '25',
		'50' => '50',
		'75' => '75',
		'100' => '100',
	),
  //Note:  do not translate record_type_default_key
//       it is the key for the default record_type_module value
  'record_type_default_key' => 'Accounts',
  'record_type_display' =>
  array (
    '' => '',
    'Accounts' => 'Account',
    'Opportunities' => 'Opportunity',
    'Cases' => 'Case',
    'Leads' => 'Lead',
    'Contacts' => 'Contacts', // cn (11/22/2005) added to support Emails




    'Bugs' => 'Bug',
    'Project' => 'Project',



    'ProjectTask' => 'Project Task',
    'Tasks' => 'Task',
    'Prospects' => 'Prospect',
  ),

  'record_type_display_notes' =>
  array (
    'Accounts' => 'Account',
	'Contacts' => 'Contact',
    'Opportunities' => 'Opportunity',
    'Cases' => 'Case',
    'Leads' => 'Lead',






    'Bugs' => 'Bug',
    'Emails' => 'Email',
    'Project' => 'Project',
    'ProjectTask' => 'Project Task',
    'Meetings' => 'Meeting',
    'Calls' => 'Call'
  ),






































	
  'quote_type_dom' =>
  array (
    'Quotes' => 'Quote',
    'Orders' => 'Order',
  ),
  'default_quote_stage_key' => 'Draft',
  'quote_stage_dom' =>
  array (
    'Draft' => 'Draft',
    'Negotiation' => 'Negotiation',
    'Delivered' => 'Delivered',
    'On Hold' => 'On Hold',
    'Confirmed' => 'Confirmed',
    'Closed Accepted' => 'Closed Accepted',
    'Closed Lost' => 'Closed Lost',
    'Closed Dead' => 'Closed Dead',
  ),
  'default_order_stage_key' => 'Pending',
  'order_stage_dom' =>
  array (
    'Pending' => 'Pending',
    'Confirmed' => 'Confirmed',
    'On Hold' => 'On Hold',
    'Shipped' => 'Shipped',
    'Cancelled' => 'Cancelled',
  ),

//Note:  do not translate quote_relationship_type_default_key
//       it is the key for the default quote_relationship_type_dom value
  'quote_relationship_type_default_key' => 'Primary Decision Maker',
  'quote_relationship_type_dom' =>
  array (
    '' => '',
    'Primary Decision Maker' => 'Primary Decision Maker',
    'Business Decision Maker' => 'Business Decision Maker',
    'Business Evaluator' => 'Business Evaluator',
    'Technical Decision Maker' => 'Technical Decision Maker',
    'Technical Evaluator' => 'Technical Evaluator',
    'Executive Sponsor' => 'Executive Sponsor',
    'Influencer' => 'Influencer',
    'Other' => 'Other',
  ),
  'layouts_dom' =>
  array (
    'Standard' => 'Proposal',
    'Invoice' => 'Invoice',
    'Terms' => 'Payment Terms'
  ),

  'bug_priority_default_key' => 'Medium',
  'bug_priority_dom' =>
  array (
    'Urgent' => 'Urgent',
    'High' => 'High',
    'Medium' => 'Medium',
    'Low' => 'Low',
  ),
   'bug_resolution_default_key' => '',
  'bug_resolution_dom' =>
  array (
  	'' => '',
  	'Accepted' => 'Accepted',
    'Duplicate' => 'Duplicate',
    'Fixed' => 'Fixed',
    'Out of Date' => 'Out of Date',
    'Invalid' => 'Invalid',
    'Later' => 'Later',
  ),
  'bug_status_default_key' => 'New',
  'bug_status_dom' =>
  array (
    'New' => 'New',
    'Assigned' => 'Assigned',
    'Closed' => 'Closed',
    'Pending' => 'Pending',
    'Rejected' => 'Rejected',
  ),
   'bug_type_default_key' => 'Bug',
  'bug_type_dom' =>
  array (
    'Defect' => 'Defect',
    'Feature' => 'Feature',
  ),

  'source_default_key' => '',
  'source_dom' =>
  array (
	'' => '',
  	'Internal' => 'Internal',
  	'Forum' => 'Forum',
  	'Web' => 'Web',
  	'InboundEmail' => 'Email'
  ),

  'product_category_default_key' => '',
  'product_category_dom' =>
  array (
	'' => '',
  	'Accounts' => 'Accounts',
  	'Activities' => 'Activities',
  	'Bug Tracker' => 'Bug Tracker',
  	'Calendar' => 'Calendar',
  	'Calls' => 'Calls',
  	'Campaigns' => 'Campaigns',  	
  	'Cases' => 'Cases',
  	'Contacts' => 'Contacts',
  	'Currencies' => 'Currencies',
  	'Dashboard' => 'Dashboard',
  	'Documents' => 'Documents',
  	'Emails' => 'Emails',
  	'Feeds' => 'Feeds',
  	'Forecasts' => 'Forecasts',  	
  	'Help' => 'Help',
  	'Home' => 'Home',
  	'Leads' => 'Leads',
  	'Meetings' => 'Meetings',
  	'Notes' => 'Notes',
  	'Opportunities' => 'Opportunities',
  	'Outlook Plugin' => 'Outlook Plugin',
  	'Product Catalog' => 'Product Catalog',  	
  	'Products' => 'Products',  	
  	'Projects' => 'Projects',  	
  	'Quotes' => 'Quotes',
  	'Releases' => 'Releases',
  	'RSS' => 'RSS',
  	'Studio' => 'Studio',
  	'Upgrade' => 'Upgrade',
  	'Users' => 'Users',
  ),

  /*Added entries 'Queued' and 'Sending' for 4.0 release..*/
  'campaign_status_dom' =>
  array (
    	'' => '',
        'Planning' => 'Planning',
        'Active' => 'Active',
        'Inactive' => 'Inactive',
        'Complete' => 'Complete',
        'In Queue' => 'In Queue',
        'Sending'=> 'Sending',
  ),
  'campaign_type_dom' =>
  array (
        '' => '',
        'Telesales' => 'Telesales',
        'Mail' => 'Mail',
        'Email' => 'Email',
        'Print' => 'Print',
        'Web' => 'Web',
        'Radio' => 'Radio',
        'Television' => 'Television',
        'NewsLetter' => 'Newsletter',
        ),

  'newsletter_frequency_dom' =>
  array (
        '' => '',
        'Weekly' => 'Weekly',
        'Monthly' => 'Monthly',
        'Quarterly' => 'Quarterly',
        'Annually' => 'Annually',
        ),


  'notifymail_sendtype' =>
  array (
    'sendmail' => 'sendmail',
    'SMTP' => 'SMTP',
  ),
  'dom_timezones' => array('-12'=>'(GMT - 12) International Date Line West',
  							'-11'=>'(GMT - 11) Midway Island, Samoa',
  							'-10'=>'(GMT - 10) Hawaii',
  							'-9'=>'(GMT - 9) Alaska',
  							'-8'=>'(GMT - 8) San Francisco',
  							'-7'=>'(GMT - 7) Phoenix',
  							'-6'=>'(GMT - 6) Saskatchewan',
  							'-5'=>'(GMT - 5) New York',
  							'-4'=>'(GMT - 4) Santiago',
  							'-3'=>'(GMT - 3) Buenos Aires',
  							'-2'=>'(GMT - 2) Mid-Atlantic',
  							'-1'=>'(GMT - 1) Azores',
  							'0'=>'(GMT)',
  							'1'=>'(GMT + 1) Madrid',
  							'2'=>'(GMT + 2) Athens',
  							'3'=>'(GMT + 3) Moscow',
  							'4'=>'(GMT + 4) Kabul',
  							'5'=>'(GMT + 5) Ekaterinburg',
  							'6'=>'(GMT + 6) Astana',
  							'7'=>'(GMT + 7) Bangkok',
  							'8'=>'(GMT + 8) Perth',
  							'9'=>'(GMT + 9) Seol',
  							'10'=>'(GMT + 10) Brisbane',
  							'11'=>'(GMT + 11) Solomone Is.',
  							'12'=>'(GMT + 12) Auckland',
  							),
      'dom_cal_month_long'=>array(
                '0'=>"",
                '1'=>"January",
                '2'=>"February",
                '3'=>"March",
                '4'=>"April",
                '5'=>"May",
                '6'=>"June",
                '7'=>"July",
                '8'=>"August",
                '9'=>"September",
                '10'=>"October",
                '11'=>"November",
                '12'=>"December",
        ),
    'dom_meridiem_lowercase'=>array(
                'am'=>"am",
                'pm'=>"pm"
        ),
    'dom_meridiem_uppercase'=>array(
                 'AM'=>'AM',
                 'PM'=>'PM'
        ),  
    'dom_report_types'=>array(
                'tabular'=>'Rows and Columns',
                'summary'=>'Summation',
                'detailed_summary'=>'Summation with details',
        ),
	'dom_email_types'=> array(
		'out'		=> 'Sent',
		'archived'	=> 'Archived',
		'draft'		=> 'Draft',
		'inbound'	=> 'Inbound',
        'campaign'  => 'Campaign'
	),
	'dom_email_status' => array (
		'archived'	=> 'Archived',
		'closed'	=> 'Closed',
		'draft'		=> 'In Draft',
		'read'		=> 'Read',
		'replied'	=> 'Replied',
		'sent'		=> 'Sent',
		'send_error'=> 'Send Error',
		'unread'	=> 'Unread',
	),
		
	'dom_email_server_type' => array(	''			=> '--None--',
										'imap'		=> 'IMAP',
										'pop3'		=> 'POP3',
	),
	'dom_mailbox_type'		=> array(/*''			=> '--None Specified--',*/
									 'pick'		=> 'Create [Any]',
									 'bug'		=> 'Create Bug',
					 				 'support'	=> 'Create Case',
					 				 'contact'  => 'Create Contact',
					 				 'sales'	=> 'Create Lead',
					 				 'task'		=> 'Create Task',
					 				 'bounce'	=> 'Bounce Handling',
	),
	'dom_email_distribution'=> array(''				=> '--None--',
									 'direct'		=> 'Direct Assign',
									 'roundRobin'	=> 'Round-Robin',
									 'leastBusy'	=> 'Least-Busy',
	),
	'dom_email_errors'		=> array(1 => 'Only select one user when Direct Assigning items.',
									 2 => 'You must assign Only Checked Items when Direct Assigning items.',
	),
	'dom_email_bool'		=> array('bool_true' => 'Yes',
								 	 'bool_false' => 'No',
	),
	'dom_int_bool'			=> array(1 => 'Yes',
								 	 0 => 'No',
	),
	'dom_switch_bool'		=> array ('on' => 'Yes',
										'off' => 'No',
										'' => 'No', ),
	'dom_email_link_type'	=> array(	''			=> 'System Default Mail Client',
										'sugar'		=> 'SugarCRM Mail Client',
										'mailto'	=> 'External Mail Client'),

	'dom_email_editor_option'=> array(	''			=> 'Default Email Format',
										'html'		=> 'HTML Email',
										'plain'		=> 'Plain Text Email'),

	
	'schedulers_times_dom'	=> array(	'not run'		=> 'Past Run Time, Not Executed',
										'ready'			=> 'Ready',
										'in progress'	=> 'In Progress',
										'failed'		=> 'Failed',
										'completed'		=> 'Completed',
										'no curl'		=> 'Not Run: No cURL available',
	),
    'scheduler_status_dom' => 
        array (
        'Active' => 'Active',
        'Inactive' => 'Inactive',
        ),

    'scheduler_period_dom' => 
        array (
        'min' => 'Minutes',
        'hour' => 'Hours',
        ),

	'forecast_schedule_status_dom' =>
  	array (
    'Active' => 'Active',
    'Inactive' => 'Inactive',
  ),
	'forecast_type_dom' =>
  	array (
    'Direct' => 'Direct',
    'Rollup' => 'Rollup',
  ),  
	
	'document_category_dom' =>
  	array (
  	'' => '',
    'Marketing' => 'Marketing',
    'Knowledege Base' => 'Knowledge Base',
    'Sales' => 'Sales',    
  ),  

	'document_subcategory_dom' =>
  	array (
  	'' => '',
    'Marketing Collateral' => 'Marketing Collateral',
    'Product Brochures' => 'Product Brochures',
	'FAQ' => 'FAQ',
  ),  
  
	'document_status_dom' =>
  	array (
    'Active' => 'Active',
    'Draft' => 'Draft',
	'FAQ' => 'FAQ',
	'Expired' => 'Expired',
	'Under Review' => 'Under Review',
	'Pending' => 'Pending',
  ),
  'document_template_type_dom' =>
  array(
  	''=>'',
  	'mailmerge'=>'Mail Merge',
  	'eula'=>'EULA',
  	'nda'=>'NDA',
  	'license'=>'License Agreement',
  ),
	'dom_meeting_accept_options' =>
  	array (
	'accept' => 'Accept',
	'decline' => 'Decline',
	'tentative' => 'Tentative',
  ),
	'dom_meeting_accept_status' =>
  	array (
	'accept' => 'Accepted',
	'decline' => 'Declined',
	'tentative' => 'Tentative',
	'none'		=> 'None',
  ),

























































































































































































































































































































































































































// deferred
/*// QUEUES MODULE DOMs
'queue_type_dom' => array(
	'Users' => 'Users',



	'Mailbox' => 'Mailbox',
),		   
*/

//prospect list type dom
  'prospect_list_type_dom' =>
  array (
    'default' => 'Default',
    'seed' => 'Seed',
    'exempt_domain' => 'Suppression List - By Domain',
    'exempt_address' => 'Suppression List - By Email Address',
    'exempt' => 'Suppression List - By Id',
    'test' => 'Test',
  ),
  
  'email_marketing_status_dom' => 
  array (
  	'' => '',
  	'active'=>'Active',
  	'inactive'=>'Inactive'
  ),

  'campainglog_activity_type_dom' =>
  array (
  	''=>'',
    'targeted' => 'Message Sent/Attempted',
    'send error'=>'Bounced Messages,Other',
    'invalid email'=>'Bounced Messages,Invalid Email',
    'link'=>'Click-thru Link',
    'viewed'=>'Viewed Message',
    'removed'=>'Opted Out',
    'lead'=>'Leads Created',
    'contact'=>'Contacts Created',
    'blocked'=>'Suppressed by address or domain',        
  ),

  'campainglog_target_type_dom' =>
  array (
    'Contacts' => 'Contacts',
    'Users'=>'Users',
    'Prospects'=>'Targets',
    'Leads'=>'Leads',
  ),
  
  'merge_operators_dom' => array (
    'like'=>'Contains',
    'exact'=>'Exactly',
    'start'=>'Starts With',
  ),

  'custom_fields_merge_dup_dom'=> array (
        0=>'Disabled',
        1=>'Enabled',





  ),
   
  'navigation_paradigms' => array(
        'm'=>'Modules',
        'gm'=>'Grouped Modules',
  ),
  










































	'projects_priority_options' => array (
		'high' 		=> 'High',
		'medium' 	=> 'Medium',
		'low' 		=> 'Low',
	),
	
	'projects_status_options' => array (
		'notstarted' 	=> 'Not Started',
		'inprogress' 	=> 'In Progress',
		'completed' 	=> 'Completed',
	),
);

$app_strings = array (





	










	
	'ERR_CREATING_FIELDS' => 'Error filling in additional detail fields: ',
	'ERR_CREATING_TABLE' => 'Error creating table: ',
	'ERR_DECIMAL_SEP_EQ_THOUSANDS_SEP'	=> "The decimal separator cannot use the same character as the thousands separator.\\n\\n  Please change the values.",
	'ERR_DELETE_RECORD' => 'A record number must be specified to delete the contact.',
	'ERR_EXPORT_DISABLED' => 'Exports Disabled.',
	'ERR_EXPORT_TYPE' => 'Error exporting ',
	'ERR_INVALID_AMOUNT' => 'Please enter a valid amount.',
	'ERR_INVALID_DATE_FORMAT' => 'The date format must be: ',
	'ERR_INVALID_DATE' => 'Please enter a valid date.',
	'ERR_INVALID_DAY' => 'Please enter a valid day.',
	'ERR_INVALID_EMAIL_ADDRESS' => 'not a valid email address.',
	'ERR_INVALID_FILE_REFERENCE' => 'Invalid File Reference',
	'ERR_INVALID_HOUR' => 'Please enter a valid hour.',
	'ERR_INVALID_MONTH' => 'Please enter a valid month.',
	'ERR_INVALID_TIME' => 'Please enter a valid time.',
	'ERR_INVALID_YEAR' => 'Please enter a valid 4 digit year.',
	'ERR_NEED_ACTIVE_SESSION' => 'An active session is required to export content.',
	'ERR_NOT_ADMIN' => "Unauthorized access to administration.",
	'ERR_MISSING_REQUIRED_FIELDS' => 'Missing required field:',
	'ERR_INVALID_VALUE' => 'Invalid Value:',
	'ERR_NO_SUCH_FILE' =>'File does not exist on system',
	'ERR_NO_SINGLE_QUOTE' => 'Cannot use the single quotation mark for ',
	'ERR_NOTHING_SELECTED' =>'Please make a selection before proceeding.',
	'ERR_OPPORTUNITY_NAME_DUPE' => 'An opportunity with the name %s already exists.  Please enter another name below.',
	'ERR_OPPORTUNITY_NAME_MISSING' => 'An opportunity name was not entered.  Please enter an opportunity name below.',
	'ERR_POTENTIAL_SEGFAULT' => 'A potential Apache segmentation fault was detected.  Please notify your system administrator to confirm this problem and have her/him report it to SugarCRM.',
	'ERR_SELF_REPORTING' => 'User cannot report to him or herself.',
	'ERR_SINGLE_QUOTE'	=> 'Using the single quote is not supported for this field.  Please change the value.',
	'ERR_SQS_NO_MATCH_FIELD' => 'No match for field: ',
	'ERR_SQS_NO_MATCH' =>'No Match',
	
	
	'LBL_ACCOUNT'=>'Account',
	'LBL_ACCOUNTS'=>'Accounts',
	'LBL_ACCUMULATED_HISTORY_BUTTON_KEY' => 'H',
	'LBL_ACCUMULATED_HISTORY_BUTTON_LABEL' => 'View Summary',
	'LBL_ACCUMULATED_HISTORY_BUTTON_TITLE' => 'View Summary [Alt+H]',
	'LBL_ADD_BUTTON_KEY' => 'A',
	'LBL_ADD_BUTTON_TITLE' => 'Add [Alt+A]',
	'LBL_ADD_BUTTON' => 'Add',
	'LBL_ADD_DOCUMENT' => 'Add Document',
	'LBL_ADD_TO_PROSPECT_LIST_BUTTON_KEY' => 'L',
	'LBL_ADD_TO_PROSPECT_LIST_BUTTON_LABEL' => 'Add To Target List',
	'LBL_ADD_TO_PROSPECT_LIST_BUTTON_TITLE' => 'Add To Target List',
	'LBL_ADDITIONAL_DETAILS_CLOSE_TITLE' => 'Click to Close',
	'LBL_ADDITIONAL_DETAILS_CLOSE' => 'Close',
	'LBL_ADDITIONAL_DETAILS' => 'Additional Details',
	'LBL_ADMIN' => 'Admin',
	'LBL_ALT_HOT_KEY' => 'Alt+',
	'LBL_ARCHIVE' => 'Archive',
	'LBL_ASSIGNED_TO_USER'=>'Assigned to User',
	'LBL_ASSIGNED_TO' => 'Assigned to:',
	'LBL_BACK' => 'Back',
	'LBL_BILL_TO_ACCOUNT'=>'Bill to Account',
	'LBL_BILL_TO_CONTACT'=>'Bill to Contact',
	'LBL_BROWSER_TITLE' => 'SugarCRM - Commercial Open Source CRM',
	'LBL_BUGS'=>'Bugs',
	'LBL_BY' => 'by',
	'LBL_CALLS'=>'Calls',
	'LBL_CAMPAIGNS_SEND_QUEUED' => 'Send Queued Campaign Emails',
	'LBL_CANCEL_BUTTON_KEY' => 'X',
	'LBL_CANCEL_BUTTON_LABEL' => 'Cancel',
	'LBL_CANCEL_BUTTON_TITLE' => 'Cancel [Alt+X]',
	'LBL_CASE'=>'Case',
	'LBL_CASES'=>'Cases',
	'LBL_CHANGE_BUTTON_KEY' => 'G',
	'LBL_CHANGE_BUTTON_LABEL' => 'Change',
	'LBL_CHANGE_BUTTON_TITLE' => 'Change [Alt+G]',
	'LBL_CHARSET' => 'UTF-8',
	'LBL_CHECKALL' => 'Check All',
	'LBL_CLEAR_BUTTON_KEY' => 'C',
	'LBL_CLEAR_BUTTON_LABEL' => 'Clear',
	'LBL_CLEAR_BUTTON_TITLE' => 'Clear [Alt+C]',
	'LBL_CLEARALL' => 'Clear All',
	'LBL_CLOSE_WINDOW'=>'Close Window',
	'LBL_CLOSEALL_BUTTON_KEY' => 'Q',
	'LBL_CLOSEALL_BUTTON_LABEL' => 'Close All',
	'LBL_CLOSEALL_BUTTON_TITLE' => 'Close All [Alt+I]',
    'LBL_CLOSE_AND_CREATE_BUTTON_LABEL' => 'Close and Create New',
    'LBL_CLOSE_AND_CREATE_BUTTON_TITLE' => 'Close and Create New [Alt+C]',
    'LBL_CLOSE_AND_CREATE_BUTTON_KEY' => 'C',    
	'LBL_COMPOSE_EMAIL_BUTTON_KEY' => 'L',
	'LBL_COMPOSE_EMAIL_BUTTON_LABEL' => 'Compose Email',
	'LBL_COMPOSE_EMAIL_BUTTON_TITLE' => 'Compose Email [Alt+L]',
	'LBL_CONTACT_LIST' => 'Contact List',
	'LBL_CONTACT'=>'Contact',
	'LBL_CONTACTS'=>'Contacts',
	'LBL_CREATE_BUTTON_LABEL' => 'Create',
	'LBL_CREATED_BY_USER'=>'Created by User',
	'LBL_CREATED' => 'Created by',
	'LBL_CURRENT_USER_FILTER' => 'Only my items:',
	'LBL_DATE_ENTERED' => 'Date Created:',
	'LBL_DATE_MODIFIED' => 'Last Modified:',
	'LBL_DELETE_BUTTON_KEY' => 'D',
	'LBL_DELETE_BUTTON_LABEL' => 'Delete',
	'LBL_DELETE_BUTTON_TITLE' => 'Delete [Alt+D]',
	'LBL_DELETE_BUTTON' => 'Delete',
	'LBL_DELETE' => 'Delete',
	'LBL_DELETED'=>'Deleted',
	'LBL_DIRECT_REPORTS'=>'Direct Reports',
	'LBL_DONE_BUTTON_KEY' => 'X',
	'LBL_DONE_BUTTON_LABEL' => 'Done',
	'LBL_DONE_BUTTON_TITLE' => 'Done [Alt+X]',
	'LBL_DST_NEEDS_FIXIN' => 'The application requires a Daylight Saving Time fix to be applied.  Please go to the <a href="index.php?module=Administration&action=DstFix">Repair</a> link in the Admin console and apply the Daylight Saving Time fix.',
	'LBL_DUPLICATE_BUTTON_KEY' => 'U',
	'LBL_DUPLICATE_BUTTON_LABEL' => 'Duplicate',
	'LBL_DUPLICATE_BUTTON_TITLE' => 'Duplicate [Alt+U]',
	'LBL_DUPLICATE_BUTTON' => 'Duplicate',
	'LBL_EDIT_BUTTON_KEY' => 'E',
	'LBL_EDIT_BUTTON_LABEL' => 'Edit',
	'LBL_EDIT_BUTTON_TITLE' => 'Edit [Alt+E]',
	'LBL_EDIT_BUTTON' => 'Edit',
	'LBL_VIEW_BUTTON_KEY' => 'V',
	'LBL_VIEW_BUTTON_LABEL' => 'View',
	'LBL_VIEW_BUTTON_TITLE' => 'View [Alt+V]',
	'LBL_VIEW_BUTTON' => 'View',
	'LBL_EMAIL_PDF_BUTTON_KEY' => 'M',
	'LBL_EMAIL_PDF_BUTTON_LABEL' => 'Email as PDF',
	'LBL_EMAIL_PDF_BUTTON_TITLE' => 'Email as PDF [Alt+M]',
	'LBL_EMAILS'=>'Emails',
	'LBL_EMPLOYEES' => 'Employees',
	'LBL_ENTER_DATE' => 'Enter Date',
	'LBL_EXPORT_ALL' => 'Export All',
	'LBL_EXPORT' => 'Export',
    'LBL_GO_BUTTON_LABEL' => 'Go',
	'LBL_HIDE'=>'Hide',
	'LBL_ID'=>'ID',
	'LBL_IMPORT_PROSPECTS'=>'Import Targets',
	'LBL_IMPORT' => 'Import',
    'LBL_IMPORT_STARTED' => 'Import Started: ',    
    'LBL_MISSING_CUSTOM_DELIMITER' => 'Must specify a custom delimiter.',    
	'LBL_LAST_VIEWED' => 'Last Viewed',
	'LBL_LEADS'=>'Leads',
	'LBL_CAMPAIGN' => 'Campaign:',
	'LBL_CAMPAIGN_ID'=>'campaign_id',
	
	'LBL_LIST_ACCOUNT_NAME' => 'Account Name',
	'LBL_LIST_ASSIGNED_USER' => 'User',
	'LBL_LIST_CONTACT_NAME' => 'Contact Name',
	'LBL_LIST_CONTACT_ROLE' => 'Contact Role',
	'LBL_LIST_EMAIL' => 'Email',
	'LBL_LIST_NAME' => 'Name',
	'LBL_LIST_OF' => 'of',
	'LBL_LIST_PHONE' => 'Phone',
	'LBL_LIST_USER_NAME' => 'User Name',
	'LBL_LISTVIEW_MASS_UPDATE_CONFIRM' => 'Are you sure you want to update the entire list?',
	'LBL_LISTVIEW_NO_SELECTED' => 'Please select at least 1 record to proceed.',
    'LBL_LISTVIEW_TWO_REQUIRED' => 'Please select at least 2 records to proceed.',    
	'LBL_LISTVIEW_OPTION_CURRENT' => 'Current Page',
	'LBL_LISTVIEW_OPTION_ENTIRE' => 'Entire List',
	'LBL_LISTVIEW_OPTION_SELECTED' => 'Selected Records',
	'LBL_LISTVIEW_SELECTED_OBJECTS' => 'Selected: ',
	
	'LBL_LOCALE_NAME_EXAMPLE_FIRST' => 'John',
	'LBL_LOCALE_NAME_EXAMPLE_LAST' => 'Doe',
	'LBL_LOCALE_NAME_EXAMPLE_SALUTATION' => 'Mr.',
	'LBL_LOGOUT' => 'Logout',
	'LBL_MAILMERGE_KEY' => 'M',
	'LBL_MAILMERGE' => 'Mail Merge',
	'LBL_MASS_UPDATE' => 'Mass Update',
	'LBL_MEETINGS'=>'Meetings',
	'LBL_MEMBERS'=>'Members',
	'LBL_MODIFIED_BY_USER'=>'Modified by User',
	'LBL_MODIFIED' => 'Modified by',
	'LBL_MY_ACCOUNT' => 'My Account',
	'LBL_NAME' => 'Name',
	'LBL_NEW_BUTTON_KEY' => 'N',
	'LBL_NEW_BUTTON_LABEL' => 'Create',
	'LBL_NEW_BUTTON_TITLE' => 'Create [Alt+N]',
	'LBL_NEXT_BUTTON_LABEL' => 'Next',
	'LBL_NONE' => '--None--',
	'LBL_NOTES'=>'Notes',
	'LBL_OPENALL_BUTTON_KEY' => 'O',
	'LBL_OPENALL_BUTTON_LABEL' => 'Open All',
	'LBL_OPENALL_BUTTON_TITLE' => 'Open All [Alt+O]',
	'LBL_OPENTO_BUTTON_KEY' => 'T',
	'LBL_OPENTO_BUTTON_LABEL' => 'Open To: ',
	'LBL_OPENTO_BUTTON_TITLE' => 'Open To: [Alt+T]',
	'LBL_OPPORTUNITIES'=>'Opportunities',
	'LBL_OPPORTUNITY_NAME' => 'Opportunity Name',
	'LBL_OPPORTUNITY'=>'Opportunity',
	'LBL_OR' => 'OR',
	'LBL_PERCENTAGE_SYMBOL' => '%',
	'LBL_PRODUCT_BUNDLES'=>'Product Bundles',
	'LBL_PRODUCT_BUNDLES'=>'Product Bundles',
	'LBL_PRODUCTS'=>'Products',
	'LBL_PROJECT_TASKS'=>'Project Tasks',
	'LBL_PROJECTS'=>'Projects',
	'LBL_PROJECTS'=>'Projects',
	'LBL_QUOTE_TO_OPPORTUNITY_KEY' => 'O',
	'LBL_QUOTE_TO_OPPORTUNITY_LABEL' => 'Create Opportunity from Quote',
	'LBL_QUOTE_TO_OPPORTUNITY_TITLE' => 'Create Opportunity from Quote [Alt+O]',
	'LBL_QUOTES_SHIP_TO'=>'Quotes Ship to',
	'LBL_QUOTES'=>'Quotes',
	'LBL_RELATED_RECORDS' => 'Related Records',
	'LBL_REMOVE' => 'Remove',
	'LBL_REQUIRED_SYMBOL' => '*',
	'LBL_SAVE_BUTTON_KEY' => 'S',
	'LBL_SAVE_BUTTON_LABEL' => 'Save',
	'LBL_SAVE_BUTTON_TITLE' => 'Save [Alt+S]',
    'LBL_SAVE_AS_BUTTON_KEY' => 'A',
    'LBL_SAVE_AS_BUTTON_LABEL' => 'Save As',
    'LBL_SAVE_AS_BUTTON_TITLE' => 'Save As [Alt+A]',
    'LBL_FULL_FORM_BUTTON_KEY' => 'F',
    'LBL_FULL_FORM_BUTTON_LABEL' => 'Full Form',
    'LBL_FULL_FORM_BUTTON_TITLE' => 'Full Form [Alt+F]',
	'LBL_SAVE_NEW_BUTTON_KEY' => 'V',
	'LBL_SAVE_NEW_BUTTON_LABEL' => 'Save & Create New',
	'LBL_SAVE_NEW_BUTTON_TITLE' => 'Save & Create New [Alt+V]',
	'LBL_SEARCH_BUTTON_KEY' => 'Q',
	'LBL_SEARCH_BUTTON_LABEL' => 'Search',
	'LBL_SEARCH_BUTTON_TITLE' => 'Search [Alt+Q]',
	'LBL_SEARCH' => 'Search',
	'LBL_SELECT_BUTTON_KEY' => 'T',
	'LBL_SELECT_BUTTON_LABEL' => 'Select',
	'LBL_SELECT_BUTTON_TITLE' => 'Select [Alt+T]',
	'LBL_SELECT_CONTACT_BUTTON_KEY' => 'T',
	'LBL_SELECT_CONTACT_BUTTON_LABEL' => 'Select Contact',
	'LBL_SELECT_CONTACT_BUTTON_TITLE' => 'Select Contact [Alt+T]',
    'LBL_GRID_SELECTED_FILE' => 'selected file',
    'LBL_GRID_SELECTED_FILES' => 'selected files',
	'LBL_SELECT_REPORTS_BUTTON_LABEL' => 'Select from Reports',
	'LBL_SELECT_REPORTS_BUTTON_TITLE' => 'Select Reports',
	'LBL_SELECT_USER_BUTTON_KEY' => 'U',
	'LBL_SELECT_USER_BUTTON_LABEL' => 'Select User',
	'LBL_SELECT_USER_BUTTON_TITLE' => 'Select User [Alt+U]',
	'LBL_SERVER_RESPONSE_RESOURCES' => 'Resources used to construct this page (queries, files)',
	'LBL_SERVER_RESPONSE_TIME_SECONDS' => 'seconds.',
	'LBL_SERVER_RESPONSE_TIME' => 'Server response time:',
	'LBL_SHIP_TO_ACCOUNT'=>'Ship to Account',
	'LBL_SHIP_TO_CONTACT'=>'Ship to Contact',
	'LBL_SHORTCUTS' => 'Shortcuts',
	'LBL_SHOW'=>'Show',
	'LBL_SQS_INDICATOR' => '',
	'LBL_STATUS_UPDATED'=>'Your Status for this event has been updated!',
	'LBL_STATUS'=>'Status:',
	'LBL_SUBJECT' => 'Subject',
	'LBL_SYNC' => 'Sync',
	'LBL_SYNC' => 'Sync',
    'LBL_TABGROUP_ALL' => 'All',
    'LBL_TABGROUP_ACTIVITIES' => 'Activities',
    'LBL_TABGROUP_COLLABORATION' => 'Collaboration',
    'LBL_TABGROUP_HOME' => 'Home',
    'LBL_TABGROUP_MARKETING' => 'Marketing',
    'LBL_TABGROUP_MY_PORTALS' => 'My Portals',
    'LBL_TABGROUP_OTHER' => 'Other',
    'LBL_TABGROUP_REPORTS' => 'Reports',
    'LBL_TABGROUP_SALES' => 'Sales',
    'LBL_TABGROUP_SUPPORT' => 'Support',
    'LBL_TABGROUP_TOOLS' => 'Tools',
	'LBL_TASKS'=>'Tasks',
	'LBL_TEAMS_LINK'=>'Team',
	'LBL_THOUSANDS_SYMBOL' => 'K',
	'LBL_TRACK_EMAIL_BUTTON_KEY' => 'K',
	'LBL_TRACK_EMAIL_BUTTON_LABEL' => 'Archive Email',
	'LBL_TRACK_EMAIL_BUTTON_TITLE' => 'Archive Email [Alt+K]',
	'LBL_UNAUTH_ADMIN' => 'Unauthorized access to administration',
	'LBL_UNDELETE_BUTTON_LABEL' => 'Undelete',
	'LBL_UNDELETE_BUTTON_TITLE' => 'Undelete [Alt+D]',
	'LBL_UNDELETE_BUTTON' => 'Undelete',
	'LBL_UNDELETE' => 'Undelete',
	'LBL_UNSYNC' => 'Unsync',
	'LBL_UPDATE' => 'Update',
	'LBL_USER_LIST' => 'User List',
	'LBL_USERS_SYNC'=>'Users Sync',
	'LBL_USERS'=>'Users',
	'LBL_VIEW_PDF_BUTTON_KEY' => 'P',
	'LBL_VIEW_PDF_BUTTON_LABEL' => 'Print as PDF',
	'LBL_VIEW_PDF_BUTTON_TITLE' => 'Print as PDF [Alt+P]',
	
	'LNK_ABOUT' => 'About',
	'LNK_ADVANCED_SEARCH' => 'Advanced Search',
	'LNK_BASIC_SEARCH' => 'Basic Search',
    'LNK_SAVED_VIEWS' => 'Saved Search & Layout',
	'LNK_DELETE_ALL' => 'del all', 
	'LNK_DELETE' => 'del',
	'LNK_EDIT' => 'edit',
	'LNK_GET_LATEST'=>'Get latest',
	'LNK_GET_LATEST_TOOLTIP'=>'Replace with latest version',
	'LNK_HELP' => 'Help',
	'LNK_LIST_END' => 'End',
	'LNK_LIST_NEXT' => 'Next',
	'LNK_LIST_PREVIOUS' => 'Previous',
	'LNK_LIST_RETURN' => 'Return to List',
	'LNK_LIST_START' => 'Start',
	'LNK_LOAD_SIGNED'=>'Sign',
	'LNK_LOAD_SIGNED_TOOLTIP'=>'Replace with signed document',
	'LNK_PRINT' => 'Print',
	'LNK_REMOVE' => 'rem',
	'LNK_RESUME' => 'Resume',
	'LNK_VIEW_CHANGE_LOG' => 'View Change Log',
    
	
	'NTC_CLICK_BACK' => 'Please click the browser back button and fix the error.',
	'NTC_DATE_FORMAT' => '(yyyy-mm-dd)',
	'NTC_DATE_TIME_FORMAT' => '(yyyy-mm-dd 24:00)',
	'NTC_DELETE_CONFIRMATION_MULTIPLE' => 'Are you sure you want to delete selected record(s)?',
	'NTC_DELETE_CONFIRMATION' => 'Are you sure you want to delete this record?',
	'NTC_LOGIN_MESSAGE' => 'Please enter your username and password.',
	'NTC_NO_ITEMS_DISPLAY' => 'none',
	'NTC_REMOVE_CONFIRMATION' => 'Are you sure you want to remove this relationship?',
	'NTC_REQUIRED' => 'Indicates required field',
	'NTC_SUPPORT_SUGARCRM' => 'Support the SugarCRM open source project with a donation through PayPal - it\'s fast, free and secure!',
	'NTC_TIME_FORMAT' => '(24:00)',
	'NTC_WELCOME' => 'Welcome',
	'NTC_YEAR_FORMAT' => '(yyyy)',
	'LOGIN_LOGO_ERROR'=> 'Please replace the SugarCRM logos.',
	'ERROR_FULLY_EXPIRED'=> "Your company's license for SugarCRM has expired for more than 30 days and needs to be brought up to date. Only admins may login.",
	'ERROR_LICENSE_EXPIRED'=> "Your company's license for SugarCRM needs to be updated. Only admins may login",
	'ERROR_LICENSE_VALIDATION'=> "Your company's license for SugarCRM needs to be validated. Only admins may login",
	'ERROR_NO_RECORD' => 'Error retrieving record.  This record may be deleted or you may not be authorized to view it.',
	'LBL_DUP_MERGE'=>'Find Duplicates',
    'LBL_MANAGE_SUBSCRIPTIONS'=>'Manage Subscriptions',
    'LBL_MANAGE_SUBSCRIPTIONS_FOR'=>'Manage Subscriptions for ',
    'LBL_SUBSCRIBE'=>'Subscribe',
    'LBL_UNSUBSCRIBE'=>'Unsubscribe',
	// Ajax status strings
	'LBL_LOADING' => 'Loading ...',
	'LBL_SAVING_LAYOUT' => 'Saving Layout ...',
    'LBL_SAVED_LAYOUT' => 'Layout has been saved.',
    'LBL_SAVED' => 'Saved',
    'LBL_SAVING' => 'Saving',
    'LBL_FAILED' => 'Failed!',
    'LBL_DISPLAY_COLUMNS' => 'Display Columns',
    'LBL_HIDE_COLUMNS' => 'Hide Columns',
    'LBL_SEARCH_CRITERIA' => 'Search Criteria',
    'LBL_SAVED_VIEWS' => 'Saved Views',
    'LBL_PROCESSING_REQUEST'=>'Processing..',
    'LBL_REQUEST_PROCESSED'=>'Done',





    'LBL_MERGE_DUPLICATES'  => 'Merge Duplicates',
    'LBL_SAVED_SEARCH_SHORTCUT' => 'Saved Searches',
    'LBL_SEARCH_POPULATE_ONLY'=> 'Perform a search using the search form above',
    'LBL_DETAILVIEW'=>'Detail View', 
    'LBL_LISTVIEW'=>'List View', 
    'LBL_EDITVIEW'=>'Edit View',
    'LBL_SEARCHFORM'=>'Search Form',
    'LBL_SAVED_SEARCH_ERROR' => 'Please provide a name for this view.',
	'LBL_DISPLAY_LOG' => 'Display Log',
	'ERROR_JS_ALERT_SYSTEM_CLASS' => 'System',
	'ERROR_JS_ALERT_TIMEOUT_TITLE' => 'Session Timeout',
	'ERROR_JS_ALERT_TIMEOUT_MSG_1' => 'Your session is about to timeout in 2 minutes. Please save your work.',
	'ERROR_JS_ALERT_TIMEOUT_MSG_2' =>'Your session has timed out.',
	'MSG_JS_ALERT_MTG_REMINDER_AGENDA' => "\nAgenda: ",
	'MSG_JS_ALERT_MTG_REMINDER_MEETING' => 'Meeting',
	'MSG_JS_ALERT_MTG_REMINDER_CALL' => 'Call',
	'MSG_JS_ALERT_MTG_REMINDER_TIME' => 'Time: ',
	'MSG_JS_ALERT_MTG_REMINDER_LOC' => 'Location: ',
	'MSG_JS_ALERT_MTG_REMINDER_DESC' => 'Description: ',
	'MSG_JS_ALERT_MTG_REMINDER_MSG' => "\nClick OK to view this meeting or click Cancel to dismiss this message.",
    // contextMenu strings    
    'LBL_ADD_TO_FAVORITES' => 'Add to My Favorites',
    'LBL_CREATE_CONTACT' => 'Create Contact',
    'LBL_CREATE_CASE' => 'Create Case',
    'LBL_CREATE_NOTE' => 'Create Note',
    'LBL_CREATE_OPPORTUNITY' => 'Create Opportunity',
    'LBL_SCHEDULE_CALL' => 'Schedule Call',
    'LBL_SCHEDULE_MEETING' => 'Schedule Meeting',
    'LBL_CREATE_TASK' => 'Create Task',
    'LBL_REMOVE_FROM_FAVORITES' => 'Remove From My Favorites',
    //web to lead
    'LBL_GENERATE_WEB_TO_LEAD_FORM' => 'Generate Form', 
    'LBL_SAVE_WEB_TO_LEAD_FORM' =>'Save Web To Lead Form',     
    
	'LBL_PLEASE_SELECT' => 'Please Select',          
	'LBL_REDIRECT_URL'=>'Redirect URL',
    'LBL_RELATED_CAMPAIGN' =>'Related campaign',  
    'LBL_ADD_ALL_LEAD_FIELDS' => 'Add All Fields',
    'LBL_REMOVE_ALL_LEAD_FIELDS' => 'Remove All Fields',
    'LBL_ONLY_IMAGE_ATTACHMENT' => 'Only image type attachment can be embedded',
	'LBL_TRAINING' => 'Training',
	'ERR_DATABASE_CONN_DROPPED'=>'Error executing a query. Possibly, your database dropped the connection. Please refresh this page, you may need to restart you web server.',
	'ERR_MSSQL_DB_CONTEXT' =>'Changed database context to',
);
?>
